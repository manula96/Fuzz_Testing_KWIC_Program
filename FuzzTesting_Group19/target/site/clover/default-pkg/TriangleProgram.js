var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":19,"id":2,"methods":[{"el":15,"sc":5,"sl":3},{"el":18,"sc":5,"sl":16}],"name":"TriangleProgram","sl":1}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":3}],"name":"runFuzzTests","pass":true,"statements":[{"sl":4},{"sl":5},{"sl":6},{"sl":7},{"sl":8},{"sl":9},{"sl":11},{"sl":13},{"sl":14}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [0], [0], [0], [0], [0], [0], [0], [], [0], [], [0], [0], [], [], [], [], [], []]
