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
      steps{
        script{
          gv = load "jenkins.groovy"
        }
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
      input{
        message "Why are you here"
        ok "Buff"
        parameters{
          choice(name: 'ENV', choices:['MACHICHGHOLK','i AM SAD','i DONT KNOW'], description: '')
          
        }
      }
      steps{
         script{
          gv.running()  
           echo "running for ${ENV}"
        }
      }
    }
     
  }
}
