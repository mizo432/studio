node {
   stage ('git clone'){
      git 'https://github.com/mizo432/studio.git'
   }

   stage ('build'){
      sh './gradlew clean build  --daemon'
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