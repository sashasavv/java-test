How to:

1. Download geckodriver from https://github.com/mozilla/geckodriver/releases and put it into `/bin` directory in the root of the project.
2. Run `mvn clean verify -P server-up` to start the local server on port 8000 with `QE-index.html` page.
3. To run end-to-end tests, open another terminal and run `mvn clean verify -P e2e`.
4. Observe test results in the terminal logs and the full test report in `/allure-results` folder.