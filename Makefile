make:
	./gradlew build
	./gradlew run
	xdg-open  app/build/reports/tests/test/classes/edu.iit.cs445.spring22.AppTest.html
	
test:
	./gradlew build
	./gradlew jacocoTestReport
	xdg-open app/build/reports/jacoco/test/html/index.html

	
clean:
	./gradlew clean
