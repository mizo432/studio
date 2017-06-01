node {
   stage ('git clone'){
      git 'https://github.com/mizo432/studio.git'
   }

   stage ('clean'){
      sh './gradlew --daemon clean'
   }

   stage ('build'){
      sh './gradlew --daemon :venus-util:build'
      sh './gradlew --daemon :ddd:build'
      sh './gradlew --daemon :studio-generic:build'
      sh './gradlew --daemon :studio-core:build'
      sh './gradlew --daemon :studio-externals:build'
      sh './gradlew --daemon :studio-adapter:build'
      sh './gradlew --daemon :studio-manage-web:build'
      sh './gradlew --daemon :studio-web:build'
      sh './gradlew --daemon :image-web:build'
   }

   stage ('create reports'){
   sh './gradlew jacoco'

   sh './gradlew jdepend'

   sh './gradlew findbugsMain'

   }


// JUnitテストレポートを保存
   stage ('copy test report'){
      step([$class: 'JUnitResultArchiver', testResults: '**/build/test-results/*.xml'])
   }

   stage('assembles reports'){
        jacoco exclusionPattern: '**/*Test*.class'
        openTasks canComputeNew: false, defaultEncoding: '', excludePattern: '', healthy: '', high: 'FIXME', ignoreCase: true, low: 'XXX', normal: 'TODO', pattern: '**/*.java', unHealthy: ''
        findbugs canComputeNew: false, defaultEncoding: '', excludePattern: '', healthy: '', includePattern: '', pattern: '**/build/reports/findbugs/*.xml', unHealthy: ''
   }

}