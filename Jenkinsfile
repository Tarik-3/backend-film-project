pipeline{
  agent any
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
        sh "mvn spring-boot:run"
        
      }
    }
     
  }
}
