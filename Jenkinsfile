#!/usr/bin/env groovy

pipeline {
    agent any
    tools { 
        maven 'Apache Maven 3.6.1'
    }
    stages {
    	stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }
        stage('Checkout') {
	        steps {
	        	git url: 'git@github.com:gyles/letter-generator.git',
        		credentialsId: 'Jenkins',
        		branch: 'master'
	        }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}