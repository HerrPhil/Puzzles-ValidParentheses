# Puzzles-ValidParentheses

Confirm whether a string of parentheses characters is valid.

## Leetcode Video Notes

You are given a parentheses string.

When is the parentheses string valid?

A parentheses string is valid when it satisfies these 3 rules:

1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
3. Every close bracket has a corresponding open bracket of the same type.

Use a stack to verify that the input is valid.

Suppose we are given `(){}`.

We use a stack to do this.

When we see an open bracket, then we push it on the stack.

When we see a close bracket, then we must verify that the top of the stack is the matching open bracket.

If this is true, then pop the open bracket from the stack.

When we finished analyzing every character of the input, then we must ensure the stack is empty.

When the stack is not empty, then there was an unmatched parenthesis in the input.
