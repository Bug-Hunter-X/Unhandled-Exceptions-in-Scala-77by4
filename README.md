# Unhandled Exceptions in Scala

This repository demonstrates a common error in Scala code: throwing exceptions without sufficient handling.  Improper exception handling can lead to unexpected program termination or crashes. 

The `bug.scala` file showcases the issue: an `IllegalArgumentException` is thrown if the input to `myMethod` is non-positive. However, there's no mechanism to gracefully handle this situation (e.g., returning a default value or logging the error).  The `bugSolution.scala` file provides a solution.

This example highlights the importance of robust exception handling in Scala development, for creating more reliable and resilient applications.