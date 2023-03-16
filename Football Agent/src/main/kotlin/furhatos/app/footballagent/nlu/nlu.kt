package furhatos.app.footballagent.nlu

import furhatos.nlu.Intent
import furhatos.util.Language

class GetInfo: Intent(){
    override fun getEnum(lang: Language): List<String> {
        return listOf("")
    }
}
