# AppEightDice
## DataBinding
- 데이터 결합 라이브러리
- build.gradle 선언 방법  
```
buildFeatures{
    dataBinding true
}
```
- 태그 이용하여 결합
```
<layout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto">
    <data> <!-- 결합 변수 -->
        <variable
            name="viewmodel"
            type="com.myapp.data.ViewModel" />
    </data>
    <ConstraintLayout... />
</layout>
```
- DataBinding 세팅
```
// 레이아웃 파일 이름을 기반으로 Binding 접미사를 추가하여 결합 클래스 생성
private lateinit var binding : ActivityMainBinding

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    // DataBinding 세팅
    binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
``` 
AppEightDice에서 [DataBinding](https://github.com/okrecords/AppEightDice/blob/567772f8c22c05332722d7508dfa754bfcf402a0/app/src/main/java/com/okre/appeightdice/MainActivity.kt#L12)
<br/><br/><br/>

## Random Number
두 가지 방법
1. Random.nextInt(from, util) : from 이상 util 미만

AppEightDice에서 [Random.nextInt(from, util)](https://github.com/okrecords/AppEightDice/blob/567772f8c22c05332722d7508dfa754bfcf402a0/app/src/main/java/com/okre/appeightdice/MainActivity.kt#L29)

2. (IntRange).random() : range 이상 이하

AppEightDice에서 [(IntRange).random()](https://github.com/okrecords/AppEightDice/blob/567772f8c22c05332722d7508dfa754bfcf402a0/app/src/main/java/com/okre/appeightdice/MainActivity.kt#L31)
<br/><br/><br/>

## when
- 조건에 충족이 될 때까지 모든 인수를 순차적으로 검사 

AppEightDice에서 [when](https://github.com/okrecords/AppEightDice/blob/567772f8c22c05332722d7508dfa754bfcf402a0/app/src/main/java/com/okre/appeightdice/MainActivity.kt#L36)
