How to:

1. Run `mvn clean verify -P server-up` to start the local server on port 8000 with `QE-index.html` page.
2. To run end-to-end tests, open another terminal and run `mvn clean verify -P e2e`.
3. Observe test results in the terminal logs and the full test report in `/allure-results` folder.