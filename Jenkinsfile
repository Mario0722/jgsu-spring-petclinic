pipeline {
    agent any
    triggers {
        pollSCM('* * * * *')
    }
    stages {
        stage('Build') {
            steps {
                // Run Maven on a Unix agent.
                bat '.\\mvnw clean package'

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }
        }
    }

<<<<<<< HEAD
    post {
         always {
             junit '**/target/surefire-reports/TEST-*.xml'
             archiveArtifacts 'target/*.jar'
         }
    }
}

=======
>>>>>>> 738cdeb9a88fe7e900a0ed319010cbba6759890a
