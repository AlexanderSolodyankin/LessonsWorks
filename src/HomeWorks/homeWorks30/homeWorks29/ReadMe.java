package HomeWorks.homeWorks30.homeWorks29;

public class ReadMe {
    /**
     * 1. Как вы понимаете Error? RuntimeException? CheckedException?
     * RuntimeException? это ошибка обробатывающееся в реальном времени которую должен исправить программис
     * или которая происходит по виде самого программися (не предсказуемые ошибки)
     * CheckedException? это ошибка которая выходит вине опаротуры или внешнего фактора обычно их можно предсказать
     *
     * 2. Для чего применяется throw?
     * это что то вроде вызова или констотации самой ошибки которая показывает что может быть ошибка или при помощи нее
     * можно вызвать ошибку (переводится как бросок) то есть это выброс или выскакивание ошибки
     *
     * 3. Разница между Unchecked Exceptions & Checked Exceptions? (Прям совсем своими словами!)
     * Анчек ошибка это ошибка которая может выйти в программе по непредсказуемым моментам или при ее использовании
     * самый яркий пример могу привести из компьютерных игр когда в физике прописано одно или другое дейтвие
     * но данные действия не должны по логике соприкосатся к примеру перемещение по вертикали и горизонтали
     * и если подйти по диогонали совмещая перемещение двух плоскостей выходит баг  который ускоряет пересонажа
     * в данном случае это ошибка программиста так как он не учел что пользователь мог таким образом использовать програму
     * и это нужно исправить программисту для коректной работы программы
     * ЧЕК Ошибка это независящая ошибка от программиста опять таки же если игра потребляет ресурсы компа одни а у пользователя они занижены
     * то игра не запустится и тут исправить ее можно только поменяв систему и это не зависящий от программиста фактор
     *
     * 4. Как вы понимаете блоки try {} catch {} finally {}?
     * try это блок попытки в которой работает потенциально опасный код нужен для того чтобы не прерывать
     * работу программы
     * CAtch блок это блок в котором обробатывается ошибка в которой можно прописать дольнейшее действия для его испроавления
     * или укозания действия для того чтобы ее исправить.
     * Finally этот блок работает даже если выскакиевает ошибка и в моем представлении это своего рода предохронитель
     * котоырй может сработать даже если программа остановилась из за ошибки
     *
     * 5. Почему при множественном catch, сначала используем более детальные Exceptions, и только потом переходим к родителям?
     * не совсем понял суть вопроса
     * но вроде как если кэтчей много то сночало мы сортируем по возможным ошибкам и пытаемся исправить ошибку программы
     * и если идут непредвиденные результаты то там уже смотрим где и как была вызвана ошибка так как она не была предсказана
     */
}
