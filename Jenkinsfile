#!groovy

node {

	// ---------------------------------
	// -- COMPILAR
	// ---------------------------------
	stage 'Compile'

	//Configurando variables
	echo 'Configurando variables'
	def mvnHome = tool 'M3'
	env.PATH = "${mvnHome}/bin:${env.PATH}"
	echo "var mvnHome='${mvnHome}'"

	sh 'mvn -B verify'


	// -- Descarga código desde SCM
	echo 'Descargando código de SCM'

	checkout scm
	//checkout scm: [$class: 'GitSCM', branches: [[name: '*/develop']], userRemoteConfigs: [[url: 'https://github.com/anders3118/MDW-SWARM.git']]]


	 // -- Compilando
	echo 'Compilando aplicación'
	sh 'mvn clean compile'

	// ------------------------------------
    // -- ETAPA: Instalar
    // ------------------------------------
    stage 'Install'
    echo 'Instala el paquete generado en el repositorio maven'
    sh 'mvn install -Dmaven.test.skip=true'


}