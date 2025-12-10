import dateFormat from "dateformat";

export const dateUtil = () => {

const formatDateTime = (date) => {
        if (!date) return "";
        try {
            let tempDate;
            if (/^\d{2}-\d{2}-\d{4} \d{2}:\d{2}:\d{2}$/.test(date)) {
                const [d, m, y, h, min, s] = date.match(/\d+/g).map(Number);
                tempDate = new Date(y, m - 1, d, h, min, s);
            } else {
                tempDate = new Date(date);
            }
            return dateFormat(tempDate, "dd-mmm-yyyy hh:MM TT");
        } catch (e) {
            console.error("Error formatting date:", date, e);
            return "";
        }
    };

     return { formatDateTime };
};