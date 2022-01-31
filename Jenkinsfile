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

        stage("pull"){

            steps{
                cd /home/ubuntu/ml
                sudo git pull
            }
        }
    }
}
