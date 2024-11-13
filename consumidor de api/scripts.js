// Função para exibir dados em uma tabela dentro do contêiner
function displayData(data) {
    const outputDiv = document.getElementById('output');
    outputDiv.innerHTML = ''; // Limpa o conteúdo anterior

    if (data.length === 0) {
        outputDiv.innerHTML = '<p>Nenhum dado encontrado.</p>';
    } else {
        const table = document.createElement('table');
        const headerRow = document.createElement('tr');

        // Cria cabeçalhos a partir das chaves do primeiro objeto
        Object.keys(data[0]).forEach(key => {
            const th = document.createElement('th');
            th.textContent = key;
            headerRow.appendChild(th);
        });
        table.appendChild(headerRow);

        // Cria as linhas da tabela com os dados
        data.forEach(item => {
            const row = document.createElement('tr');
            Object.values(item).forEach(value => {
                const td = document.createElement('td');
                td.textContent = value;
                row.appendChild(td);
            });
            table.appendChild(row);
        });

        outputDiv.appendChild(table);
    }
}

// Funções para carregar dados de cada endpoint
function loadUsuarios() {
    fetch('http://localhost:8100/relatorio/dashboard/usuario')
        .then(response => response.json())
        .then(data => displayData(data))
        .catch(error => console.error('Erro ao carregar usuários:', error));
}

function loadServicos() {
    fetch('http://localhost:8100/relatorio/dashboard/servico')
        .then(response => response.json())
        .then(data => displayData(data))
        .catch(error => console.error('Erro ao carregar serviços:', error));
}

function loadFuncionarios() {
    fetch('http://localhost:8100/relatorio/dashboard/funcionario')
        .then(response => response.json())
        .then(data => displayData(data))
        .catch(error => console.error('Erro ao carregar funcionários:', error));
}

function loadClientes() {
    fetch('http://localhost:8100/relatorio/dashboard/cliente')
        .then(response => response.json())
        .then(data => displayData(data))
        .catch(error => console.error('Erro ao carregar clientes:', error));
}
