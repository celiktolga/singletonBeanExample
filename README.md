# singletonBeanExample
This project is for myself understand that if singleton bean is thread safe or not.

As i understand that Spring singleton bean does not gurantee you thread safe.
I am able to change the value but is it thread safe? 
No, we (developers) should handle it on our side.

ie: preventing to changing values from outside of the class only reading /getting instace maybe.



by the way my output was:
----------
1 Tolga
1 Tolga
2 Tayfun