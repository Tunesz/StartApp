# 🅿️ ParkEscola - Sistema de Gerenciamento de Estacionamento Escolar

Sistema moderno e intuitivo para gerenciamento do estacionamento de escolas, facilitando o controle de veículos de alunos, professores, funcionários e visitantes.

![Tunesz]([https://github.com/SEU_USUARIO/ParkEscola/blob/main/assets/carlos.png](https://github.com/Tunesz/StartApp.git))

---

## ✨ Funcionalidades

### ✅ Principais Features
- Cadastro de usuários (Alunos, Professores, Funcionários e Visitantes)
- Cadastro de veículos com placa, modelo, cor e foto (opcional)
- Gerenciamento de vagas (alocação fixa e rotativa)
- Controle de entrada e saída com registro de horário
- Dashboard em tempo real com vagas disponíveis
- Relatórios de utilização do estacionamento
- Histórico completo de movimentações
- Busca rápida por placa ou nome
- Sistema de notificações (em breve)

### 🔐 Níveis de Acesso
- **Administrador** - Controle total do sistema
- **Secretaria** - Gerenciamento de cadastros e relatórios
- **Segurança** - Apenas registro de entrada/saída

---

## 🛠️ Tecnologias Utilizadas

- **Backend**: Python + Flask (ou Django - escolha uma)
- **Frontend**: HTML5, CSS3, JavaScript + Bootstrap 5
- **Banco de Dados**: SQLite (desenvolvimento) / PostgreSQL (produção)
- **Outros**: SQLAlchemy, WTForms, Flask-Login


### Passo a passo

```bash
# Clone o repositório
git clone https://github.com/SEU_USUARIO/ParkEscola.git
cd ParkEscola

# Crie e ative o ambiente virtual
python -m venv venv
source venv/bin/activate    # Linux/Mac
# venv\Scripts\activate     # Windows

# Instale as dependências
pip install -r requirements.txt

# Configure o banco de dados
flask db init
flask db migrate
flask db upgrade

# Execute a aplicação
flask ru
