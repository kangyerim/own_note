import api from './index';

const TestApi = {
  hello : () => {
    const url = '/hello'
    const method = 'get'

    return api({url, method})
  }
}

export default TestApi;