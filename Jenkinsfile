pipeline{
  agent any
  parameters{
    choice(name: “VERSION”, choices:['1.1','1.2','1.3'], description: '')
    booleanParam(name:'executeTests', defaultValue: true, description: '')
}
  environment{
    CREDENTIAL = credentials("Tarik-3")
  }
  tools{
    maven 'maven-3.9.6'
  }
  stages{
    stage("testing"){
      when{
        expression{
          params.executeTests
        }
      }
      steps{
      echo"I am Tarik, and I am here"
        sh "mvn package"
        
      }
    }
    stage("running"){
      steps{
      echo"I am Tarik, and I am a hero"
        echo"Running with ${CREDENTIAL}"
        echo "${params.VERSION}"
        
        
      }
    }
     
  }
}
