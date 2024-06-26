package cl.maui.poslogMaui.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeStampFormatter {

    /**
     * Gera um timestamp formatado com a data e hora atual.
     * Este método retorna uma string representando a data e hora atuais formatadas
     * de acordo com o padrão "dd-MMM-yy hh.mm.ss.SSSSSS a" em inglês. Isso inclui
     * o dia, o mês abreviado, o ano, a hora, os minutos, os segundos, os microssegundos,
     * e o indicador AM/PM. O resultado é sempre convertido para letras maiúsculas.
     *
     * @return Uma string representando a data e hora atuais, formatada e convertida
     * para letras maiúsculas, seguindo o padrão "dd-MMM-yy hh.mm.ss.SSSSSS a".
     */
    public static String generateFormattedTimestamp() {
        Date agora = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("dd-MMM-yy hh.mm.ss.SSSSSS a", Locale.ENGLISH);
        return formatador.format(agora).toUpperCase();
    }
}
