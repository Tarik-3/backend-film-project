def test() {
   echo"I am Tarik, and I am here"
        sh "mvn package"
}

def building() {
   echo "I will build the project image"
   withCredentials([usernamePassword(credentialsId:"Tarik-docker",passwordVariable:"PASS", usernameVariable: "USER")]){
      sh "docker build -t tarik3/jenkins-test:${params.VERSION} ."
      sh "echo $PASS | docker login -u $USER --password-stdin" 
      sh "docker push tarik3/jenkins-test:${params.VERSION} "
   }
   
   
}
def running() {
  echo"I will run the image"
   sh "docker run tarik3/jenkins-test:${params.VERSION} "
}
def deploy() {
   echo "Deployement"
  
}
return this
