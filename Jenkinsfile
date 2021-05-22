pipeline{
  agent any
       stages{
             stage('Compile')
             {
                 steps{
                     withMaven(maven: 'maven_3_8_1' )
                     sh 'mvn clean compile'
                     
                 }
             }
       }
}