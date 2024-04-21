.data
num1: .word 14
num2: .word 15
sum: .word 0

.text
.globl main
main:

lw $s0, num1
lw $s1, num2

add $sp, -8 # save $s0 & $s1
sw $s0, 8($sp)
sw $s1, 4($sp)
jal sumFunc # transfer control to sumFunc.
lw $s1, 4($sp) # restore $s1
lw $s0, 8($sp) # restore $s0
add $sp, 8
sw $s1, sum

li $v0, 10
syscall
sumFunc: sw $ra, ($sp) # save return address

add $sp, -4
add $s1, $s1, $s0
add $sp, 4
lw $ra, ($sp) # restore return address
jr $ra # return