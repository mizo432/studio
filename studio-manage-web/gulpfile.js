var gulp = require('gulp');
var jscompile = require('./.gulpfiles/jscompile');
var scsscompile = require('./.gulpfiles/scsscompile');

gulp.task('browserify', function () {
    return jscompile(false);
});

gulp.task('watchify', function () {
    return jscompile(true);
});

gulp.task('css', function () {
    return scsscompile();
});

gulp.task('watch', ['watchify'], function () {
    gulp.watch('src/main/ts/static/scss/**/*.scss', ['css']);
});

// デザイン完了したら本タスク削除 -> CSSのパスをthymeleaf用に修正した後にstatic/staticを削除
gulp.task('image', function () {
    gulp.src('src/main/ts/static/img/**').pipe(gulp.dest('src/main/resources/static/static/img'));
});

gulp.task('build', ['browserify', 'css']);
gulp.task('default', ['build']);
