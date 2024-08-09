How to:

1. These tests are run in Firefox browser. Download a compatible version of geckodriver from https://github.com/mozilla/geckodriver/releases and put it into `/bin` directory in the root of the project.
2. Run `mvn clean verify -P server-up` to start the local server with `QE-index.html` on http://localhost:8000.
3. To run end-to-end tests, open another terminal and run `mvn test -P e2e`.
4. Observe test results in the terminal and the full test report in `/allure-results` folder.

   <img width="819" alt="Screenshot 2024-08-08 at 17 52 03" src="https://github.com/user-attachments/assets/58c47622-8fab-468c-880a-a196608a8a71">
