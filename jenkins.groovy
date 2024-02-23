def test() {
   echo"I am Tarik, and I am here"
        sh "mvn package"
}

def running() {
  echo"I am Tarik, and I am a hero"
        echo"Running with ${CREDENTIAL}"
        echo "${params.VERSION}"
    
}
return this
