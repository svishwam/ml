pipeline{

    agent any

    stages{

        stage("build"){

            steps{

                echo 'building the files...'
            }
        }

        stage("push"){

            steps{

               echo 'pushing the file'

            }
        }
    }
    post{
        success{
            cd /home/ubuntu/ml
            sudo git pull
        }
    }
}
