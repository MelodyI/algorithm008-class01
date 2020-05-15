# Fast InvSqrt() 扩展阅读
[地址](https://www.beyond3d.com/content/articles/8/)
## 代码
最牛逼的代码，O(1)时间复杂度计算平方根!
```c
float InvSqrt (float x) {
    float xhalf = 0.5f * x;
    int i = *(int*)&x;
    i = 0x5f3759df - (i >> 1);
    x = *(float*)&i;
    x = x * (1.5f - xhalf * x * x);
    return x;
}
```
