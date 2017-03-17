CREATE CONSTRAINT ON ( naturalperson:NaturalPerson ) ASSERT naturalperson.key IS UNIQUE
CREATE CONSTRAINT ON ( economicactivity:EconomicActivity ) ASSERT economicactivity.code IS UNIQUE
CREATE CONSTRAINT ON ( legalparty:LegalParty ) ASSERT legalparty.ogrn IS UNIQUE
CREATE INDEX ON :LegalParty( inn )
CREATE CONSTRAINT ON ( archivefile:ArchiveFile ) ASSERT archivefile.fileName IS UNIQUE
CREATE INDEX ON :ArchiveFile( dateFile )
