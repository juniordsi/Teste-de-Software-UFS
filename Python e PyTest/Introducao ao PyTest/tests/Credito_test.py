from classes import Credito

def test_concede():
    assert Credito.concederCredito(12, True, 5001)

def test_NaoConcedePorParcelasMaiorQue12():
    assert Credito.concederCredito(13, True, 5001)

def test_NaoConcedePorParcelasIgualA0():
    assert Credito.concederCredito(0, True, 5001)

def test_NaoConcedePorParcelasMenorQue0():
    assert Credito.concederCredito(-2, True, 5001)

def test_NaoConcedePorNaoConfiavel():
    assert Credito.concederCredito(5, False, 5001)

def test_NaoConcedePorSalarioMenorQue5000():
    assert Credito.concederCredito(12, True, 2500)

def test_DefinirCredito2000():
    assert Credito.concederCredito(12, True, 5001)

def test_DefinirCredito0():
    assert Credito.concederCredito(13, True, 5001)
