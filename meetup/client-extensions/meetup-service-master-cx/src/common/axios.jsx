import axios from 'axios';

export const axiosPrivate = axios.create({
    baseURL: window.location.origin,
    timeout: 300000,
    headers: {
        'Content-Type': 'application/json',
        "x-csrf-token": Liferay.authToken
     },
});