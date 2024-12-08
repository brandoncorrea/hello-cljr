using Newtonsoft.Json;
using Newtonsoft.Json.Linq;

namespace Hello;

public class World
{
    public void SayHello()
    {
        Console.WriteLine("Hello from C#!");
    }

    public string SampleSerializedObject()
    {
        var obj = new JObject();
        obj["Hello"] = "Newtonsoft.Json";
        return JsonConvert.SerializeObject(obj);
    }
}
