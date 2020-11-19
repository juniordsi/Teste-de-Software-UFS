class Credito:

    @staticmethod
    def concederCredito(parcelas: int, confiavel: bool, salario: float):
        if parcelas > 12 or parcelas < 1:
            return False

        else:
            if confiavel:
                if (salario < 5000):
                    return False
                else:
                    return True
            else:
                return False

    @staticmethod
    def definirCredito(parcelas: int, confiavel: bool, salario: float):
        if Credito.concederCredito(parcelas, confiavel, salario):
            return 20000
        else:
            return 0

__all__ = ["Credito"]