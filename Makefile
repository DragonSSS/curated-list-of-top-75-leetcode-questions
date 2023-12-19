build:
	./gradlew clean build

clean:
	./gradlew clean

commit:
	git add .
	git commit -m "-update"
	git push

.PHONY: build clean commit