
def call() {
pipeline {
    agent any
    stages {
        stage('Git Checkout') {
            steps {
                checkout([
					$class: 'GitSCM', 
					branches: [[name: "master"]], 
					userRemoteConfigs: [[url: "https://github.com/spring-projects/spring-petclinic.git"]
				])
        	}
    	}
	}
}
