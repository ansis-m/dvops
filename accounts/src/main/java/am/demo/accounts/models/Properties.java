package am.demo.accounts.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Map;


@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Properties {

    private String msg;
    private String buildVersion;
    private Map<String, String> ansis;
    private List<String> activeBranches;




}
