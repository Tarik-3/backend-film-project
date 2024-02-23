pipeline{
  agent any
  environment{
    CREDENTIAL = credentials("Tarik-3")
  }
  tools{
    maven 'maven-3.9.6'
  }
  stages{
    stage("testing"){
      steps{
      echo"I am Tarik, and I am here"
        sh "mvn package"
        
      }
    }
    stage("running"){
      steps{
      echo"I am Tarik, and I am a hero"
        echo"Running with ${CREDENTIAL}"
        sh "${CREDENTIAL}"
        
        
      }
    }
     
  }
}
