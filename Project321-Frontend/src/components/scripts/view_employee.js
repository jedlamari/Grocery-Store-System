import axios from 'axios'
import authentification from '@/main'
var config = require('../../../config')

var frontendUrl = 'http://' + config.dev.host + ':' + config.dev.port
var backendUrl = 'http://' + config.dev.backendHost + ':' + config.dev.backendPort

var AXIOS = axios.create({
  baseURL: backendUrl,
  headers: { 'Access-Control-Allow-Origin': frontendUrl }
})

export default {
    name: 'orders',
    data () {
      return {
        response: [],
        error: '',
        employees: [],
        errorEmployee: '',
        employeeEmail: '',
        Newstatus: '',
        errorStatus: '',
      }
    },
    created: function () {
        // Get all orders from backEnd
        AXIOS.get('/employees', { params: {"ownerEmail" : window.localStorage.getItem('email'), "ownerPassword" : window.localStorage.getItem('password')}})
        .then(response => {
          // JSON responses are automatically parsed.
          this.employees = response.data
        })
        .catch(e => {
          this.errorEmployee = 'There is no employees in the system'
          console.log(e)
        })
    },
    methods: {
        back: function () {
            this.$router.push('/owner')
        },
        changeStatus: function (e, s) {
            const params = new URLSearchParams();
            params.append('status', s);
            params.append('employeeEmail', e);
            console.log(e)
            params.append('ownerEmail', window.localStorage.getItem('email'));
            params.append('ownerPassword', window.localStorage.getItem('password'));
            AXIOS.post('/employee/changeStatus', params)
            .then(response => {
                this.response = response.data
            })
            .catch(e => {
              this.errorStatus = 'there is no employee with the specified email in the system'
              console.log(e)
            })
        }
    }
}