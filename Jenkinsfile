def gv
pipeline{
  agent any
  parameters{
    string(name: 'VERSION', defaultValue:'', description: 'version of the prod')
    choice(name: 'VERSION', choices:['1.1','1.2','1.3'], description: '')
    booleanParam(name:'executeTests', defaultValue: true, description: '')
}
  environment{
    CREDENTIAL = credentials("Tarik-3")
  }
  tools{
    maven 'maven-3.9.6'
  }
  stages{
    stage("init"){
      script{
        gv = load "jenkins.groovy"
      }
    }
    stage("testing"){
      when{
        expression{
          params.executeTests
        }
      }
      steps{
        script{
        gv.test()
          
        }
      }
    }
    stage("running"){
      steps{
         script{
        gv.running()
          
        }
        
      }
    }
     
  }
}
