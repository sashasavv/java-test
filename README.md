**Instructions**

The application that starts the local server at http://localhost:8000 and serves `QE-index.html` is located in `src/main/java/com/example/App.java`.

TestNG tests are located in `src/test/java/com/example` directory.

**To launch tests from CI**:

There is [GitHub Actions workflow](https://github.com/sashasavv/java-test/blob/main/.github/workflows/test.yaml) which runs tests headlessly in CI. 

To launch tests, navigate to [the workflow in GitHub](https://github.com/sashasavv/java-test/actions/workflows/test.yaml) and click "Run workflow" button. 

The test report will be saved as a workflow artifact as in [this run](https://github.com/sashasavv/java-test/actions/runs/10320836474).

**To launch tests locally**:

1. Download a compatible version of geckodriver from https://github.com/mozilla/geckodriver/releases.
2. Run `mvn clean verify -P server-up` to start the local server with `QE-index.html` on http://localhost:8000.
3. To run end-to-end tests, open another terminal and run `mvn test -Denv=local -Dwebdriver.path=<GECKODRIVER_PATH> -P e2e`.
4. Observe test results in the terminal. To view TestNG test report, open `target/surefire-reports/index.html`.

   <img width="819" alt="Screenshot 2024-08-08 at 17 52 03" src="https://github.com/user-attachments/assets/58c47622-8fab-468c-880a-a196608a8a71">
