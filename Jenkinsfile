node {
   stage ('git clone'){
      git 'https://github.com/mizo432/studio.git'
   }

   stage ('clean'){
      sh './gradlew --daemon clean'
   }

   stage ('build'){
      sh './gradlew --daemon :venus-utils:build'
      sh './gradlew --daemon :ddd:build'
      sh './gradlew --daemon :studio-generic:build'
      sh './gradlew --daemon :studio-core:build'
      sh './gradlew --daemon :studio-externals:build'
      parallel(
         "stream1": {
            echo 'start of stream1'
            sh './gradlew --daemon :studio-presenters:build'
         },
         "stream2" : {
            echo "start of stream2"
            sh './gradlew --daemon :studio-datasources:build'
         },
         "stream3" : {
            echo "start of stream2"
            sh './gradlew --daemon :studio-usecases:build'
         }
      )
      echo "3つのJOBが完了しました。。"
      sh './gradlew --daemon :studio-manage-web:build'
      sh './gradlew --daemon :studio-web:build'
   }

   stage ('create reports'){
   sh './gradlew jacocoTestReport --daemon'

   sh './gradlew jdepend --daemon'

   }

// JUnitテストレポートを保存
//   stage ('copy test report'){
//      step([$class: 'JUnitResultArchiver', testResults: '**/build/test-results/*.xml'])
//   }

   stage('assembles reports'){
        jacoco exclusionPattern: '**/*Test*.class'
        openTasks canComputeNew: false, defaultEncoding: '', excludePattern: '', healthy: '', high: 'FIXME', ignoreCase: true, low: 'XXX', normal: 'TODO', pattern: '**/*.java', unHealthy: ''
        findbugs canComputeNew: false, defaultEncoding: '', excludePattern: '', healthy: '', includePattern: '', pattern: '**/build/reports/findbugs/*.xml', unHealthy: ''
        warnings canComputeNew: false, canResolveRelativePaths: false, consoleParsers: [[parserName: 'Java Compiler (javac)'], [parserName: 'JavaDoc Tool']], defaultEncoding: '', excludePattern: '', healthy: '', includePattern: '', messagesPattern: '', unHealthy: ''
   }

}