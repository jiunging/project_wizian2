$(document).ready(function() {
    // 체크박스를 클릭할 때마다 폼의 action 속성을 변경합니다.
    $('input[type="checkbox"]').change(function() {
        // 체크된 체크박스의 id를 가져옵니다.
        var checkedCheckboxId = $(this).attr('id');
        var url;
        // 체크된 체크박스의 id에 따라 URL을 설정합니다.
        switch (checkedCheckboxId) {
            case 'checkbox1':
                url = '/user_co/hire_co_document';
                break;
            case 'checkbox2':
                url = 'https://www.daum.net';
                break;
            case 'checkbox3':
                url = 'https://www.google.com';
                break;
            default:
                url = ''; // 기본값 설정
        }
        $('#myForm').attr('action', url);
    });
});