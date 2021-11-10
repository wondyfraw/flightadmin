pipeline {
    agent any
    tools{
        maven 'Maven 3.8.3'
        jdk 'jdk9'
    }
    stages {
           stage('Initialize'){
              steps{
                echo 'Initialize'
              }
           }
           stages {
                   stage('Compile stage') {
                       steps {
                           bat "mvn clean compile"
                   }
               }
              }
//            stage('Compile'){
//               steps {
//                           withMaven(maven : 'apache-maven-3.8.3') {
//                               bat'mvn clean compile'
//                           }
//                       }
//                      }
           stage('Build'){
             steps{
                echo 'This is minimal pipeline.'
             }
           }
//         stage('git repo & clean') {
//             steps {
//                bat "rmdir  /s /q flightadmin"
//                 bat "git clone https://github.com/wondyfraw/flightadmin.git"
//                 bat "mvn clean -f flightadmin"
//             }
//         }
//         stage('install') {
//             steps {
//                 bat "mvn install -f flightadmin"
//             }
//         }
//         stage('test') {
//             steps {
//                 bat "mvn test -f flightadmin"
//             }
//         }
//         stage('package') {
//             steps {
//                 bat "mvn package -f flightadmin"
//             }
//         }
    }
}