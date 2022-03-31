## Primeira versão do sistema
Classes:
usuario:
nome
email
senha

classe conta
idConta
-saldo

Transação
implementar métodos para gerar qrcode em string para cada operação
toda transação deve ter o idConta
a string gerada deve conter o nome do usuário que vai receber o valor
a string gerada deve conter o valor da transação
"id;Usuario;valor"
realiza pagamentos recebe creditos de outros usuários
qr code como String

realizar pagamento:
informar o usuário que vai receber o valor, o valor e a String do QR code
Id e usuario da conta devem ser validados
somente se o pagador tiver créditos
receber:
ele deve gerar a chave de autorização