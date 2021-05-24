# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)


### 기능 요구 사항
- 로또를 구매한다.
    - 로또의 가격은 1000원이다.
    - 로또는 총 6개의 숫자를 가진다.
    - 로또는 1 ~ 45 숫자 범위를 가진다.
    - 구매 금액만큼 로또를 구매할 수 있다.(여러개)
    - 로또의 숫자 6자리보다 많거나 적으면 에러를 발생한다.
    
- 구매한 후에 당첨된 로또의 번호를 입력한다.
    - 당첨된 번호도 6개의 자리를 가진다.

- 당첨된 로또의 번호와 구매한 로또의 번호를 비교한다.
    - 순서와 상관없이 숫자만 같다면 맞는 것으로 한다.
    - 당첨된 로또와 비교하여 몇 개의 숫자가 맞는지 확인할 수 있어야한다.
    
- 로또에 당첨 통계를 알 수 있어야 한다.
    - 등 수 별로 가진 로또가 몇 개 맞았는지 알 수 있어야 한다.
    - 1등은 6개가 전부 맞다면 20억, 2등은 5개가 15만원, 3등 4개가 5만원, 4등 3개가 맞다면 5천원에 금액을 보상한다.
    - 수익률이 얼마나 되는지 알 수 있어야 한다. (1이 본전)
