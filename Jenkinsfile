#!groovy

node {

	
	stage ('Compile'){		

		echo 'Configurando variables'
		
		def mvnHome = tool 'M3'
		env.PATH = "${mvnHome}/bin:${env.PATH}"
		
		echo "var mvnHome='${mvnHome}'"

		//sh 'mvn -B verify'

		echo 'Descargando código de SCM'

		checkout scm: [$class: 'GitSCM', branches: [[name: '*/develop']], userRemoteConfigs: [[url: 'https://github.com/anders3118/MDW-SWARM.git']]]

		echo 'Compilando aplicación'
		sh 'mvn clean compile'
	}

    stage ('Install'){
	    echo 'Instala el paquete generado en el repositorio maven'
	    sh 'mvn install package -Dmaven.test.skip=true'
    }
    


}