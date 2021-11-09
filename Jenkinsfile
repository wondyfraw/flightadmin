pipeline {
    agent any
    tools{
        maven 'Maven 4.0.0'
        jdk 'jdk8'
    }
    stages {
           stage('Initialize'){
              steps{
                 sh
                     echo "PATH = ${PATH}"
                     echo "M2_HOME = ${M2_HOME}"

              }
           }
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