package cmpe282
import cmpe282.Indexdata;
class IndexdataController {

    def index() {
		[data:Indexdata.index()]
	}
}