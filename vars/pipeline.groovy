

def check(Map params) {

	checkout([
		$class: 'GitSCM', 
		branches: [[name: params.branch]], 
		userRemoteConfigs: [[url: params.url]]
		])
}


def call() {
pipeline {
    agent any
    stages {
        stage('Git Checkout') {
            steps {
                check (
                    branch: "master",
                    url: "https://github.com/spring-projects/spring-petclinic.git"
                    ) 
                    
            	}
        	}
    	}
	}
}
