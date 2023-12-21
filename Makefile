export CURRENT_DATE := $(shell date +"%B %e, %Y")

build:
	@./gradlew clean build

clean:
	@./gradlew clean

commit:
	@git add .
	@git commit -m "- Update on $(CURRENT_DATE)"
	@git push

.PHONY: build clean commit