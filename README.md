# Flower_Store

Learning classes in Java with a Flower Store example

---------------------------------------------------------------------------------------------------------------------------------------------------------

### Introducted to "Linting"

Add to ci.yaml between java install and Test → Linter

- name: Lint Code Base
  uses: github/super-linter/slim@v4
  env:
    VALIDATE_ALL_CODEBASE: false
    DEFAULT_BRANCH: master
    GITHUB_TOKEN: ${{ secrets.GITHUB_TOKEN }}


- name: Lint Code Base
  uses: github/super-linter@v4
  env:
      VALIDATE_ALL_CODEBASE: false
      DEFAULT_BRANCH: master
      GITHUB_TOKEN: ${{ secrets.GITHUB_TOKEN }}

------------------------------------------------------------------------------------------------------------------------------------------------------------

## Still need to add:

- getPrice in class FlowerBucket (Demetra Law)

- class Store with a search method

- add tests
