node {
   stage 'git clone'
   git 'https://github.com/mizo432/studio.git'

   stage 'clean build'
   sh './gradlew clean build'

// JUnitテストレポートを保存
   step([$class: 'JUnitResultArchiver', testResults: '**/build/test-results/*.xml'])

}